package A.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object A_ConfigBCopy : BuildType({
    uuid = "90eb0c3b-0c2c-42a3-bbfd-f5935c3720d2"
    name = "configB_copy"

    artifactRules = "a"

    cleanup {
        keepRule {
            id = "KEEP_RULE_4"
            keepAtLeast = allBuilds()
            applyToBuilds {
                withTags = anyOf("b1", "configB1")
            }
            dataToKeep = everything()
            applyPerEachBranch = true
            preserveArtifactsDependencies = true
        }
        keepRule {
            disabled = true
            id = "KEEP_RULE_5"
            keepAtLeast = allBuilds()
        }
        keepRule {
            id = "KEEP_RULE_6"
            keepAtLeast = allBuilds()
            applyToBuilds {
                withTags = anyOf("configB_own")
            }
            dataToKeep = everything()
            applyPerEachBranch = true
            preserveArtifactsDependencies = true
        }
    }
})
