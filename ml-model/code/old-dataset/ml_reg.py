from pandas import read_csv
from pandas.plotting import scatter_matrix
from matplotlib import pyplot
from sklearn.model_selection import train_test_split
from sklearn.model_selection import cross_val_score
from sklearn.model_selection import StratifiedKFold
from sklearn.metrics import classification_report
from sklearn.metrics import confusion_matrix
# from sklearn.metrics import accuracy_score
from sklearn.linear_model import LinearRegression
from sklearn.linear_model import LogisticRegression
from sklearn.neighbors import KNeighborsRegressor
from sklearn.metrics import accuracy_score
import numpy as np
from sklearn.metrics import plot_confusion_matrix
from matplotlib.ticker import (AutoMinorLocator, MultipleLocator)
from sklearn.metrics import mean_squared_error
from math import sqrt

dataset = read_csv('data30-30-reg.csv', names=[
    'lines', 'empty_lines', 'line_comment', 'block_comment',
    'javadoc_comment', 'variables', 'variables_len_avg', 'if', 'for', 'do',
    'while', 'cast', 'complexity' 'label'
])


array = dataset.values
x = array[:, 0:-1]
y = array[:, -1]

for _ in range(1):
    x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=0)

    models = []
    models.append(('Lin Reg', LinearRegression()))
    models.append(('Logis Reg', LogisticRegression(max_iter=1000)))
    models.append(('KNN', KNeighborsRegressor()))
    results = []
    names = []
    for name, model in models:
        names.append(name)

        model.fit(x_train, y_train)
        predictions = model.predict(x_test)

        print('Model: {}'.format(name))
        # print('Accuracy score (Test data): {}'.format(accuracy_score(y_test, predictions)))
        # real_results.append(accuracy_score(y_test, predictions))

        # print(confusion_matrix(y_test, predictions))
        # confusion = confusion_matrix(y_test, predictions)
        # novice_accuracy = confusion[0][0] / (sum(confusion[0]))
        # expert_accuracy = confusion[1][1] / (sum(confusion[1]))
        # print('Accuracy score (Novice): {}'.format(novice_accuracy))
        # print('Accuracy score (Expert): {}'.format(expert_accuracy))
        # novice_results.append(novice_accuracy)
        # expert_results.append(expert_accuracy)
        # average_results.append((novice_accuracy + expert_accuracy) / 2)

        pyplot.scatter(range(len(predictions)), predictions, label="prediction")
        pyplot.scatter(range(len(predictions)), y_test, label="true")
        pyplot.legend()
        pyplot.grid()
        pyplot.show()

        fig, ax = pyplot.subplots()
        ax.scatter(y_test, predictions)
        ax.set_xlabel('True')
        ax.set_ylabel('Prediction')
        ax.set_aspect(1)
        ax.xaxis.set_major_locator(MultipleLocator(50))
        ax.yaxis.set_major_locator(MultipleLocator(50))
        ax.grid()
        ax.axhline()
        ax.axvline()
        pyplot.show()

        results.append(sqrt(mean_squared_error(y_test, predictions)))

        # print(classification_report(y_test, predictions))

        # plot_confusion_matrix(model, x_test, y_test)
        # pyplot.show()

        # print(model.predict([[45,13,2,0,0,8,5.375000,1,0,0,0,0]]))

    print(results)

    pyplot.scatter(names, results)
    pyplot.title('Algorithm Comparison (Test data) (Root Mean Squared Error)')
    pyplot.ylim(0)
    pyplot.grid()
    pyplot.show()
    #
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
