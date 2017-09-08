const fs = require('fs')
const marked = require('marked')
const last = require('lodash/last')
const Prism = require('prismjs')
require('prismjs/components/prism-java')
require('prismjs/components/prism-scala')

const slides = [
  'title',
  'about',
  'example',
  'example-java',
  'function',
  'app',
  'infix',
  'pattern-matching',
  'miscellany',
  'editorial'
]

const toCode = fileName => {
  const language = last(fileName.split('.'))
  const fullPath = `code/src/${fileName}`
  const html = Prism.highlight(fs.readFileSync(fullPath, {encoding: 'utf8'}), Prism.languages[language])
  return `<pre><code class='language-${language}'>${html}</code></pre>`
}

const resolveSource = line =>
  line.indexOf('<p>___') === 0 ? toCode(line.slice(6, line.length - 4)) : line

const resolveSources = html =>
  html.split('\n').map(s => resolveSource(s.trim())).join('\n')

const compileAndBind = markdown => {
  return resolveSources(marked(markdown))
}

module.exports = slides.map(
  name => ({
    name,
    html: () => compileAndBind(fs.readFileSync(`api/slides/${name}.md`, {encoding: 'utf8'}))
  })
)
