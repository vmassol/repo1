#!/usr/bin/env groovy

def call(jobConfig, body)
{
    env.xwikiVar = "hello"

    body()
}
