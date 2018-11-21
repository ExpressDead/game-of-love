## Game of Love

If it helps you can think of this as a variation on Conway's Game of Life. You will pick up on the variations quickly. This is the first iteration and needs a lot of work.


## Get started

- Clone this repo
- Try running the app with the default configuration

``` clojure
{:dedicated true ;; begin with a deddicated lover
 :basic-rules true ;; for now the basic rules need to be true (more rules later!)
 :thoughts 6 ;; sets the thought variations for the game (beta)
 :uniqueness true ;; determines how unique the board players are
 :message-type "feels" ;; decides the game message type which is used for internal communications}
```

```
lein run
```
