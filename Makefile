.PHONY: install test

install:
	gradle testClasses

test:
	gradle test
