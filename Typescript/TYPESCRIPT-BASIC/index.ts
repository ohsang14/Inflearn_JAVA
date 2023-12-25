let a:number = 3

let b:string = "love you"
b = "true"

let c:any = 4

c = "asdfasdf"
let d: number | string  = "absfdasdf"
d = 3

let e:string[] = ['apple', 'mongo']
e.push('옥슬이')

function addNumber (a: number,b: number): number{
  return a+b
}

addNumber(5,3);