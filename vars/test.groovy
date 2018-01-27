#!/usr/bin/env groovy

def call(jobConfig, body)
{
    def var = "hello"

    body()
}

def testBuild(String name = 'Default', buildConfig)
{
    echo var
}

