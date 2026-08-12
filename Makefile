.PHONY: install test

install:
	./gradlew testClasses

test:
	./gradlew test

lint:
	./gradlew spotlessCheck

lint-fix:
	./gradlew spotlessApply

check-deps:
	./gradlew dependencyUpdates -Drevision=release
