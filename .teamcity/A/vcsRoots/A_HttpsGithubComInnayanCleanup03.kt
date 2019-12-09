package A.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object A_HttpsGithubComInnayanCleanup03 : GitVcsRoot({
    uuid = "955f6d03-eba7-499f-9084-a715ce637d88"
    name = "https://github.com/innayan/cleanup03"
    url = "https://github.com/innayan/cleanup03"
    authMethod = password {
        userName = "innayan"
        password = "credentialsJSON:27e8dc20-0ba4-4388-8caf-0101c45ce77a"
    }
})
