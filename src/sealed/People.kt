package sealed

import Gender

sealed interface People {
    var gender: Gender?
    var name: String
    var lastName: String
}