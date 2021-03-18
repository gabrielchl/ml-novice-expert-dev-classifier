import tensorflow as tf
import pandas as pd
from sklearn.model_selection import train_test_split

dataset = pd.read_csv('data40.csv', names=[
    'lines', 'empty_lines', 'line_comment', 'block_comment',
    'javadoc_comment', 'variables', 'variables_len_avg', 'if', 'for', 'do',
    'while', 'cast', 'complexity', 'label'
])
array = dataset.values
x = array[:, 0:-1]
y = array[:, -1]
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, stratify=y, random_state=0)

model = tf.keras.models.Sequential([
  tf.keras.layers.Flatten(input_shape=(28, 28)),
  tf.keras.layers.Dense(128, activation='relu'),
  tf.keras.layers.Dropout(0.2),
  tf.keras.layers.Dense(10)
])
model.fit(x_train, y_train, epochs=5)
model.evaluate(x_test,  y_test, verbose=2)
