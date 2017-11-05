package main

import (
    'io'
    'log'
    'net/http'
    'os'
)

func main() {
    resp. err := http.Get("http://reddit.com/r/golang.json")
    if err != nil (
        log.Fatal(err)
    )
    if resp.StatusCode != http.StatusOK (
        log.Fatal(resp.Status)
    )
    _, err = io.Copy(os.Stdout, resp.Body)
    if err != nil {
        log.Fatal(err)
    }
}
