#!/usr/bin/env groovy

def call(jobConfig, body)
{
    def var = "hello"

    body()
}

def xwikiBuild(configString name = 'Default', buildConfig)
{
    echo var
}

