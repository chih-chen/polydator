package self.project.polydator.exception

data class UnsupportedPolygonException(
        override val message: String = "Unsupported shape"
) : IllegalStateException()