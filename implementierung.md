org.conqat.engine.index

# Call, iteration
CloningConfiguration: Einstellungen für Analyseprofil
    - registerQualityIndicators
    - createCloneIndexTrigger
UnifiedCloneIndexSynchronizer.cqb
CloneIndexSynchronizer.java

# Normalize
StatementNormalization (normalize(): z.B. getter und setter entfernen)
ITokenNormalizer<=GenericNormalizer<=CLikeNormalizer
FastUniformNormalization

# Build index
CloneIndexBuilder<->CloneIndex
Chunk (hashing)

# Search
CloneSynchronizer.cqb
IncrementalCloneDetector cloneIndex.reportclones -> gteMatchingChunks
CloneIndexCloneSearcher

# Stuff
sentinelChunks: placeholderstmts
Export Plugin: conqat.ide.editor->rechtsklick-> export-> oberen 3 checkboxen, Dann in dropins in eclipse installation

# Benjamin
## Files einlesen
AntPatternDirectoryScanner.java
GitRepositoryConnection getContent, expandCommitTree

## Normalisieren
TokenElement mit InMemoryContentAccessos /FileContentAccessor
FastUniformNormalization gibt StatementUnits

## Index aufbauen
org.conqat.engine.code_clones.index
Selber schreiben
