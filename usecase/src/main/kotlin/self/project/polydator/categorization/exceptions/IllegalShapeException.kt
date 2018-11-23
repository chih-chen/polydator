package self.project.polydator.categorization.exceptions

data class IllegalShapeException(
        override val message: String = "Invalid shape"
) : IllegalStateException()