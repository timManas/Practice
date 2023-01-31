/**
 * @param {number[][]} graph
 * @return {number[][]}
 */
var allPathsSourceTarget = function (graph) {
  // Use DFS to start from 0 to n
  let output = []

  for (let i = 0; i < graph[0].length; i++) {
    let stack = []
    output = traverseGraph(graph[0][i], graph.length - 1, [], graph, [])
  }

  return output
}

function traverseGraph(current, end, stack, graph, output) {
  console.log('Current: ' + current)

  if (current == end) {
    // Backtrack
    console.log('End')
  } else {
  }
}

let graph = [[1, 2], [3], [3], []]
console.log('Paths: ' + allPathsSourceTarget(graph))

let graph1 = [[4, 3, 1], [3, 2, 4], [3], [4], []]
console.log('Paths: ' + allPathsSourceTarget(graph1))
