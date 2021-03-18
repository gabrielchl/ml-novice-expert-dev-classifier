from features_extractor import extract
import numpy as np
import os

from matplotlib import pyplot
from sklearn.model_selection import cross_validate
from sklearn.model_selection import StratifiedKFold
from sklearn.linear_model import LogisticRegression
from sklearn.tree import DecisionTreeClassifier
from sklearn.neighbors import KNeighborsClassifier
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis
from sklearn.naive_bayes import GaussianNB
from sklearn.svm import SVC
from sklearn.ensemble import RandomForestClassifier
from sklearn.neural_network import MLPClassifier
from sklearn.preprocessing import MinMaxScaler, StandardScaler
import joblib
import javalang

# import re


def file_to_list(filename):
    return open(filename).read().split('\n')


target_set = 40
filenames = os.listdir('../files/set{}'.format(target_set))
filenames.sort()

novices = file_to_list('../files/novice-{}.txt'.format(target_set))
experts = file_to_list('../files/expert-{}.txt'.format(target_set))

features = [
    'num_lines',
    'empty_lines',
    'avg_len_lines',
    # 'num_comments',
    # 'avg_len_comments',
    'num_variables',
    'avg_len_variables',
    'num_if',
    'num_for',
    'num_do',
    'num_while',
    'num_switch',
    # 'num_cast',
    'cond_space_ratio',
    'bracket_line_ratio',
    'num_space',
    # 'num_nodes',
    # 'height',
    'cc'
]

dataset_array = []

for filename in filenames:
    try:
        extracted_features = extract('../files/set{}/{}'.format(target_set, filename))
        if filename.replace('.java', '') in novices:
            extracted_features.append(0)
        elif filename.replace('.java', '') in experts:
            extracted_features.append(1)
        # if re.sub(r'_[^_]*_solution.java', '', filename) in novices:
        #     extracted_features.append(0)
        # elif re.sub(r'_[^_]*_solution.java', '', filename) in experts:
        #     extracted_features.append(1)
        else:
            continue
        dataset_array.append(extracted_features)
    except javalang.parser.JavaSyntaxError:
        # TODO handle the error, notify user
        pass

dataset = np.array(dataset_array)
x = dataset[:, 0:-1]
y = dataset[:, -1]

# scaler = MinMaxScaler()
# scaler = StandardScaler()
# x = scaler.fit_transform(x)

# print(dataset)
print(np.min(x, axis=0))
print(np.max(x, axis=0))

# fig, axs = pyplot.subplots(4, 4)
#
# pyplot.figure(0)
# pyplot.subplot()
# pyplot.scatter(y, x[:, 0])
# pyplot.subplot()
# pyplot.scatter(y, x[:, 1])
# pyplot.show()

fig = pyplot.figure()
fig.subplots_adjust(hspace=0.2, wspace=0.4)
fig.suptitle('Direct Comparison of Features Extracted Against Classification in Dataset')
for i in range(len(features)):
    ax = fig.add_subplot(2, 7, i + 1)
    ax.title.set_text(features[i])
    # ax.scatter(y, x[:, i], s=20, marker='.')
    # ax.set_xticks([0, 1])
    ax.boxplot([[j[i] for j in dataset_array if j[-1] == 0],
                [j[i] for j in dataset_array if j[-1] == 1]], labels=[0, 1])
    ax.set_xlabel('Classification')
    ax.set_ylabel('Feature values')
pyplot.show()

# x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, stratify=y, random_state=0)

models = []
models.append(('LR', LogisticRegression(solver='liblinear',
                                        multi_class='ovr')))
models.append(('LDA', LinearDiscriminantAnalysis()))
models.append(('KNN', KNeighborsClassifier()))
models.append(('CART', DecisionTreeClassifier(random_state=0)))
models.append(('NB', GaussianNB()))
models.append(('SVM Lin', SVC(kernel='linear')))
models.append(('SVM Pol', SVC(kernel='poly')))
models.append(('SVM RBF', SVC(kernel='rbf')))
models.append(('MLP', MLPClassifier(
    solver='lbfgs', alpha=1e-5, hidden_layer_sizes=(7, 7),
    random_state=0, max_iter=2000)))
models.append(('RF', RandomForestClassifier(n_estimators=100, random_state=0)))
# models.append(('RF', RandomForestClassifier(n_estimators=500, random_state=0)))

# evaluate each model in turn
names = []
results = []
for name, model in models:
    names.append(name)

    kfold = StratifiedKFold(n_splits=10, random_state=1, shuffle=True)
    cv_results = cross_validate(model, x, y, cv=kfold,
                                scoring='accuracy',
                                return_estimator=True)
    # print(cv_results['test_score'])
    results.append(cv_results['test_score'])

    if name == 'LR':
        coefs = []
        for model in cv_results['estimator']:
            coefs.append(model.coef_[0])

        joblib.dump(cv_results['estimator'][-1], "model.sav")

        coefs = np.array(coefs)
        print(coefs.mean(axis=0))

        pyplot.boxplot(coefs, labels=features)
        pyplot.xticks(rotation='vertical')
        pyplot.title('LR Model Coefficients')
        pyplot.ylim(-1, 1)
        pyplot.grid()
        pyplot.show()

    # model.fit(x_train, y_train)
    # joblib.dump(model, "model.sav")

    print('{}: {} ({})'.format(name, cv_results['test_score'].mean(), cv_results['test_score'].std()))

pyplot.boxplot(results, labels=names)
pyplot.title('Algorithm Comparison (K Fold, 10 Splits)')
pyplot.ylim(0, 1)
pyplot.grid()
pyplot.show()
