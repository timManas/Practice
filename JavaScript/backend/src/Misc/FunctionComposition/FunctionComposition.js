/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {
  return function (x) {
    console.log(x)
  }
}

const fn = compose([(x) => x + 1, (x) => 2 * x])
fn(4) // 9

// fn = compose([(x) => x + 1, (x) => x * x, (x) => 2 * x])
// fn(4)

// fn = compose([(x) => 10 * x, (x) => 10 * x, (x) => 10 * x])
// fn(1)

// fn = compose([])
// fn(42)
