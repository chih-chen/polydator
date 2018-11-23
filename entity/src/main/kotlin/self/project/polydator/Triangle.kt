package self.project.polydator

data class Triangle(
        val a: Coordinate,
        val b: Coordinate,
        val c: Coordinate
) {
    companion object {
        fun validate(): Boolean {
            TODO()
        }
    }
}