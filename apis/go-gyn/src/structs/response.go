package structs

type DefaultResponse struct {
	Name    string `json:"nome"`
	Age     int8   `json:"idade"`
	Job     string `json:"job"`
	Country string `json:"country"`
	City    string `json:"city"`
}