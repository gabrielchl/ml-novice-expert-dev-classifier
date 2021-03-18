from matplotlib import pyplot
from sklearn.model_selection import train_test_split
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
from sklearn.metrics import plot_confusion_matrix
import joblib
import javalang
from features_extractor import extract
import numpy as np
import os

# import re


def file_to_list(filename):
    return open(filename).read().split('\n')


target_set = 39
filenames = os.listdir('../files/set{}'.format(target_set))
filenames.sort()

novices = file_to_list('../files/novice.txt')
experts = file_to_list('../files/expert.txt')

features = [
    'num_lines',
    'empty_lines',
    'avg_len_lines',
    'num_comments',
    'avg_len_comments',
    'num_variables',
    'avg_len_variables',
    'num_if',
    'num_for',
    'num_do',
    'num_while',
    'num_switch',
    'num_cast',
    'cond_space_ratio',
    'bracket_line_ratio',
    'num_space'
    # 'num_nodes',
    # 'height'
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
X = dataset[:, 0:-1]
y = dataset[:, -1]

# # example of tpot for a classification dataset
# from sklearn.datasets import make_classification
# from sklearn.model_selection import RepeatedStratifiedKFold
# from tpot import TPOTClassifier
# # define dataset
# cv = RepeatedStratifiedKFold(n_splits=10, n_repeats=3, random_state=1)
# # define search
# model = TPOTClassifier(generations=5, population_size=50, cv=cv, scoring='accuracy', verbosity=2, random_state=1, n_jobs=-1)
# # perform the search
# model.fit(X, y)
# plot_confusion_matrix(model, X, y)
# # export the best model
# # model.export('tpot_best_model.py')

if __name__ == '__main__':
    # example of auto-sklearn for a classification dataset
    from sklearn.datasets import make_classification
    from sklearn.model_selection import train_test_split
    from sklearn.metrics import accuracy_score
    from autosklearn.classification import AutoSklearnClassifier
    # define dataset
    # split into train and test sets
    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.33, random_state=1)
    # define search
    model = AutoSklearnClassifier(time_left_for_this_task=4*60, per_run_time_limit=60, n_jobs=8, resampling_strategy='cv', resampling_strategy_arguments={'folds': 10})
    # perform the search
    model.fit(X_train, y_train)
    # summarize
    print(model.sprint_statistics())
    print(model.cv_results_)
    # evaluate best model
    y_hat = model.predict(X_test)
    acc = accuracy_score(y_test, y_hat)
    print("Accuracy: %.3f" % acc)
