package main

import (
	"api-comp/src/controllers"

	"github.com/gin-gonic/gin"
)

func main() {

	r := gin.Default()

	r.GET("/v1/cities", controllers.GetCities)

	r.Run()
}
