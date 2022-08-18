package main

import (
	"api-comp/src/structs"
	"net/http"

	"github.com/gin-gonic/gin"
)

func main() {

	r := gin.Default()
	r.GET("/dev-info", func(c *gin.Context) {
		c.JSON(http.StatusOK, structs.DefaultResponse{
			Name:    "Tarcísio Batista de Freitas Junior",
			Age:     32,
			City:    "Brasília",
			Country: "Brasil",
			Job:     "Software developer",
		})
	})
	r.Run()
}
