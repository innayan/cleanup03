package A

import A.buildTypes.*
import A.vcsRoots.*
import A.vcsRoots.A_HttpsGithubComInnayanCleanup03
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "63192156-e7c6-427c-875a-e9954324aa54"
    id("A")
    parentId("_Root")
    name = "A"

    vcsRoot(A_HttpsGithubComInnayanCleanup03)
    vcsRoot(A_HttpsGithubComInnayanClean02)

    buildType(A_ConfigBCopy)
    buildType(B_Bb)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${A_HttpsGithubComInnayanCleanup03.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }

    cleanup {
        keepRule {
            id = "KEEP_RULE_4"
            keepAtLeast = allBuilds()
            applyToBuilds {
                withTags = anyOf("a1", "gg", "test")
            }
            dataToKeep = historyAndStatistics {
                preserveArtifacts = all()
                preserveLogs = true
            }
            applyPerEachBranch = true
            preserveArtifactsDependencies = true
        }
        keepRule {
            id = "KEEP_RULE_5"
            keepAtLeast = allBuilds()
            applyToBuilds {
                withTags = anyOf("a2")
            }
            dataToKeep = everything()
            applyPerEachBranch = true
            preserveArtifactsDependencies = true
        }
        keepRule {
            id = "KEEP_RULE_9"
            keepAtLeast = allBuilds()
            applyToBuilds {
                withTags = anyOf("new,new")
            }
            dataToKeep = statisticsOnly()
            applyPerEachBranch = true
            preserveArtifactsDependencies = true
        }
        baseRule {
            all(builds = 123)
            history(builds = 123)
            artifacts(builds = 123)
        }
    }
})
