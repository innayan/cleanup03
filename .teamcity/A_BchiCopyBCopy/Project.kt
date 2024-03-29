package A_BchiCopyBCopy

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    uuid = "c4e539dd-d92f-4620-bd36-378c2d599bbc"
    id("A_BchiCopyBCopy")
    parentId("A")
    name = "Bchi_copyB_copy"
    description = "d"

    cleanup {
        keepRule {
            disabled = true
            id = "KEEP_RULE_11"
            keepAtLeast = allBuilds()
        }
        keepRule {
            id = "KEEP_RULE_3"
            keepAtLeast = allBuilds()
            applyToBuilds {
                withTags = anyOf("new")
            }
            dataToKeep = everything()
            applyPerEachBranch = true
            preserveArtifactsDependencies = true
        }
        keepRule {
            id = "KEEP_RULE_8"
            keepAtLeast = allBuilds()
            dataToKeep = statisticsOnly()
            applyPerEachBranch = true
            preserveArtifactsDependencies = true
        }
    }
})
