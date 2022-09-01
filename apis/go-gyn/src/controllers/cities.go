package controllers

import (
	"api-comp/src/structs"
	"net/http"

	"github.com/gin-gonic/gin"
)

func GetCities(c *gin.Context) {
	res := []structs.City{
		{
			Name:      "Brasilia",
			Age:       68,
			Country:   "Brazil",
			IsCapital: true,
		},
		{
			Name:      "Fortaleza",
			Age:       296,
			Country:   "Brazil",
			IsCapital: false,
		},
		{
			Name:      "New York",
			Age:       405,
			Country:   "United States",
			IsCapital: false,
		},
		{
			Name:      "City of Mexico",
			Age:       389,
			Country:   "Mexico",
			IsCapital: true,
		},
		{
			Name:      "Londres",
			Age:       891,
			Country:   "England",
			IsCapital: true,
		},
	}

	respFull := structs.Cities{res}
	c.JSON(http.StatusOK, respFull)

}
