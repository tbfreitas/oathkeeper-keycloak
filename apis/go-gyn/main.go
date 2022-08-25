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
			Language: "Golang",
			Name:     "Tarcísio Batista de Freitas Junior",
			Age:      32,
			City:     "Brasília",
			Country:  "Brazil",
			Job:      "Software developer",
		})
	})
	r.Run()
}
