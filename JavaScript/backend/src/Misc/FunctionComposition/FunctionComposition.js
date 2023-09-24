/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {
  for (let arg = 0; arg < functions.length; arg++) {
    let func = functions[arg]
    console.log(func)

    let xx = func()
    console.log(xx)
  }

  return function (x) {}
}

const fn = compose([(x) => x + 1, (x) => 2 * x])
fn(4) // 9

// fn = compose([(x) => x + 1, (x) => x * x, (x) => 2 * x])
// fn(4)

// fn = compose([(x) => 10 * x, (x) => 10 * x, (x) => 10 * x])
// fn(1)

// fn = compose([])
// fn(42)
