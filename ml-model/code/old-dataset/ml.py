from pandas import read_csv
from pandas.plotting import scatter_matrix
from matplotlib import pyplot
from sklearn.model_selection import train_test_split
from sklearn.model_selection import cross_val_score
from sklearn.model_selection import StratifiedKFold
from sklearn.metrics import classification_report
from sklearn.metrics import confusion_matrix
# from sklearn.metrics import accuracy_score
from sklearn.linear_model import LogisticRegression
from sklearn.tree import DecisionTreeClassifier
from sklearn.neighbors import KNeighborsClassifier
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis
from sklearn.naive_bayes import GaussianNB
from sklearn.svm import SVC
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score
from sklearn.neural_network import MLPClassifier
import numpy as np
from sklearn.metrics import plot_confusion_matrix
import joblib

# dataset = read_csv('data1.csv', names=[
#     'lines', 'empty_lines', 'line_comment', 'block_comment',
#     'javadoc_comment', 'variables', 'variables_len_avg', 'if', 'for', 'do',
#     'while', 'cast', 'label'
# ])



dataset = read_csv('data24-19.csv', names=[
    'lines', 'empty_lines', 'line_comment', 'block_comment',
    'javadoc_comment', 'variables', 'variables_len_avg', 'if', 'for', 'do',
    'while', 'cast', 'complexity', 'label'
])

# dataset.plot(kind='box', subplots=True, layout=(4, 4),
#              sharex=False, sharey=False)
# pyplot.show()
#
# dataset.hist()
# pyplot.show()
#
# scatter_matrix(dataset)
# pyplot.show()

array = dataset.values
x = array[:, 0:-1]
y = array[:, -1]

for _ in range(1):
    x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, stratify=y, random_state=0)

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
    models.append(('RF', RandomForestClassifier(n_estimators=1000, random_state=0)))
    # evaluate each model in turn
    results = []
    real_results = []
    novice_results = []
    expert_results = []
    average_results = []
    names = []
    for name, model in models:
        names.append(name)

        kfold = StratifiedKFold(n_splits=10, random_state=1, shuffle=True)
        cv_results = cross_val_score(model, x, y, cv=kfold,
                                     scoring='accuracy')
        results.append(cv_results)
        # names.append(name)
        # print('%s: %f (%f)' % (name, cv_results.mean(), cv_results.std()))



        model.fit(x_train, y_train)
        joblib.dump(model, "model.sav")
        predictions = model.predict(x_test)

        print('Model: {}'.format(name))
        print('Accuracy score (K Fold): %f (%f)' % (cv_results.mean(), cv_results.std()))
        print('Accuracy score (Test data): {}'.format(accuracy_score(y_test, predictions)))
        real_results.append(accuracy_score(y_test, predictions))

        # print(confusion_matrix(y_test, predictions))
        confusion = confusion_matrix(y_test, predictions)
        novice_accuracy = confusion[0][0] / (sum(confusion[0]))
        expert_accuracy = confusion[1][1] / (sum(confusion[1]))
        print('Accuracy score (Novice): {}'.format(novice_accuracy))
        print('Accuracy score (Expert): {}'.format(expert_accuracy))
        novice_results.append(novice_accuracy)
        expert_results.append(expert_accuracy)
        average_results.append((novice_accuracy + expert_accuracy) / 2)

        # print(classification_report(y_test, predictions))

        # plot_confusion_matrix(model, x_test, y_test)
        # pyplot.show()

        # print(model.predict([[45,13,2,0,0,8,5.375000,1,0,0,0,0]]))

    pyplot.boxplot(results, labels=names)
    pyplot.title('Algorithm Comparison (K Fold, 10 Splits)')
    pyplot.ylim(0, 1)
    pyplot.grid()
    pyplot.show()

    # pyplot.scatter(names, real_results)
    # pyplot.title('Algorithm Comparison (Test data)')
    # pyplot.ylim(0, 1)
    # pyplot.grid()
    # pyplot.show()

    # x = np.arange(len(names))  # the label locations
    # width = 0.2  # the width of the bars
    #
    # fig, ax = pyplot.subplots()
    # rects1 = ax.bar(x - width, novice_results, width, label='Novice')
    # rects2 = ax.bar(x, expert_results, width, label='Expert')
    # rects2 = ax.bar(x + width, average_results, width, label='Average')
    #
    # # Add some text for labels, title and custom x-axis tick labels, etc.
    # ax.set_ylabel('Accuracy')
    # ax.set_title('Algorithm Comparison Grouped by Novce / Expert')
    # ax.set_xticks(x)
    # ax.set_xticklabels(names)
    # ax.legend()
    #
    # fig.tight_layout()
    #
    # pyplot.ylim(0, 1)
    # pyplot.grid()
    #
    # pyplot.show()
