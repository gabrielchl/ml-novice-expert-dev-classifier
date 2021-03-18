from pandas import read_csv
from sklearn.linear_model import LogisticRegression
from sklearn.discriminant_analysis import LinearDiscriminantAnalysis
from matplotlib import pyplot

cols = [
    'lines', 'empty_lines', 'line_comment', 'block_comment',
    'javadoc_comment', 'variables', 'variables_len_avg', 'if', 'for', 'do',
    'while', 'cast', 'complexity', 'label'
]
dataset = read_csv('data14.csv', names=cols)

array = dataset.values
x = array[:, 0:-1]
y = array[:, -1]

model = LogisticRegression()
model.fit(x, y)

importance = model.coef_[0]
for i,v in enumerate(importance):
	print('Feature: %s, Score: %.5f' % (cols[i],v))
pyplot.bar(cols[:-1], importance)
pyplot.ylim(-1, 1)
pyplot.grid()
pyplot.show()
