package A.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object B_Bb : BuildType({
    uuid = "beb4521c-3bc7-47cb-9c07-d03f1409464a"
    name = "BB"

    cleanup {
        keepRule {
            id = "KEEP_RULE_2"
            keepAtLeast = allBuilds()
            applyToBuilds {
                withTags = anyOf("b2", "over")
            }
            dataToKeep = historyAndStatistics {
                preserveArtifacts = all()
                preserveLogs = true
            }
            applyPerEachBranch = true
            preserveArtifactsDependencies = true
        }
    }
})
