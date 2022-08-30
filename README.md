# About

Hello, have you been listen about OAUTH2 ? And do you know what is a proxy ?

In this simple, but teachable project, we can reach the main concepts of them. 

## How ?

Using a open source project as a auth module[Keycloak], to generate a valid Json Web Token and throw forward to a proxy[Ory Oathkeeper].


## Keycloak 
___________________________________________

An excelent free auth module, wrote in Java, as we can see on its web page. [keycloak-page](https://www.keycloak.org/). 

Its over APACHE2.0 license. Thus, in case you wanna try it, read the license doc.

## Ory Oathkeeper
___________________________________________

"Ory is the largest open source community in the world for cloud software application security". [ory-page](https://www.ory.sh/docs/welcome). 

We gonna use one of its products, the incredible proxy wrote in Golang(:heart:).

Also over APACHE2.0 license.

## What you need

All you need to run this project, is to install _docker_ and _docker-compose_ on your system. [docker-main-page](https://docs.docker.com/engine/install/ubuntu/)

Just follow the steps to be able to run any containers you wish over the kernel layer of your system.

## Start it

As simple as it could be, just open a terminal and type on the root folder of this project:

    ./start.sh

A *.sh* will be executed, raising up four docker containers, to simulate a autenticate local area. Among this containers, two REST apis will be exposed, making necessary a valid token to get the response. But, before check the response over HTTP1.1, we gonna create a keycloak client.

Keycloak can be sliced in many environments. But we gonna use what has already come. The allmight _master_. :volcano:


{WIP}