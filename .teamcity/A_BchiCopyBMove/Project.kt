package A_BchiCopyBMove

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    uuid = "b2cc85f6-084a-4a67-a75e-17e38775bce3"
    id("A_BchiCopyBMove")
    parentId("A")
    name = "Bchi_copyB_move"
    description = "d"

    cleanup {
        keepRule {
            id = "KEEP_RULE_4"
            keepAtLeast = allBuilds()
            applyToBuilds {
                withTags = anyOf("b1", "overriden")
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
    }
})
