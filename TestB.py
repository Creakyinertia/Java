list1=[1,2,3,4,4.5,5]
list2=[6,7,8,9,10]

l3=list1+list2
print(l3)

l3.append(15)
print(l3)

l3.remove(4)
print(l3)

list1.append("DATA")
print(list1)

list1.reverse()
list2.reverse()
l3=list1+list2
print(l3)

sampleDict={
    "class":{
        "student":{
            "name":"Mike",
            "marks":{
                "physics":70,
                "history":80
                }
        }
    }
}
print(sampleDict["class"]["student"]["marks"]["history"])

list1=[1,3,4,6,2,1,1]
a=set(list1)
print(list(a))

a=["a","t","b","x"]
a.sort()
print(a)

dict1={
    "a":1,
    "b":2,
    "c":3
}
l3=list(dict1.keys())
print(l3)
















