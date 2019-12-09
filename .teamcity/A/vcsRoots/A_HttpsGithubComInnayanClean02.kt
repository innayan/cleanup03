package A.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object A_HttpsGithubComInnayanClean02 : GitVcsRoot({
    uuid = "310a6343-db25-4757-b4ad-b767a5386f65"
    name = "https://github.com/innayan/clean02"
    url = "https://github.com/innayan/clean02"
    authMethod = password {
        userName = "innayan"
        password = "credentialsJSON:27e8dc20-0ba4-4388-8caf-0101c45ce77a"
    }
})
