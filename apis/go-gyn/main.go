package main

import (
	"net/http"
	"structs"

	"github.com/gin-gonic/gin"
)

func main() {

	r := gin.Default()
	r.GET("/ping", func(c *gin.Context) {
		c.JSON(http.StatusOK, structs.DefaultResponse{
			Nome:  "Tarcísio Batista de Freitas Junior",
			Idade: 32,
		})
	})
	r.Run()
}
