package structs

type Cities struct {
	Cities []City `json:"cities"`
}

type City struct {
	Name      string `json:"name"`
	Age       int16  `json:"age"`
	Country   string `json:"country"`
	IsCapital bool   `json:"is_capital"`
}
