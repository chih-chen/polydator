package self.project.polydator.categorization.exceptions

data class IllegalPolygonException(
        override val message: String = "Invalid sides."
) : IllegalStateException()