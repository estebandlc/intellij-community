// WITH_STDLIB

package test

typealias Global = List<String>
fun usesGlobal(p: List<Global>) {
    p.map { <caret>it.isEmpty() }
}
