class Solution(object):
    def numUniqueEmails(self, emails):

        # Step1 - Create Set to store all unique emails
        uniqueEmails = set()

        # Step2 - Traverse Email array
        for email in emails:
            print("\nCurrent Email: " + email)

            # Step3 - Split email into localname and domain name
            emailArr = email.split("@")
            localName = self.filterLocalName(emailArr[0])       # Filter the LocalName
            domainName = emailArr[1]

            # Step4 - Combine localName + @ + DomainName
            # Add to Set the unique email Address
            uniqueEmail = "@".join((localName, domainName))
            uniqueEmails.add(uniqueEmail)
            print("UniqueName: ", uniqueEmail, "    LocalName: ", localName, "      DomainName: ", domainName)

        return uniqueEmails.__len__()

    def filterLocalName(self, localName):

        output = localName

        # Filter out the +
        if '+' in localName:
            output = output[0: output.index("+")]

        # Filter out the .
        if '.' in localName:
            output = output.replace(".", "")

        return output


def main():
    # emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+dav+id@lee.tcode.com"]
    # emails = ["testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"]
    emails = ["j+ezsorqlmc@rfpycgjuf.com","j+k+ri+rigt.ad@rfpycgjuf.com","hfmeqzk.isx+i@fiidmdrsu.com","j+p+h+d+d+p+z.j.k.g@rfpycgjuf.com","zygekdy.l.w+s@snh.owpyu.com","j+m.l+ia+qdgv+w@rfpycgjuf.com","r+hwbjwefkp@wcjaki.n.com","zygekdy.l.w+d@snh.owpyu.com","bizdm+sz.f.a.k@il.cjjlp.com","hfmeqzk.isx+t@fiidmdrsu.com","hfmeqzk.isx+i@fiidmdrsu.com","bizdm+f+j+m.l.l@il.cjjlp.com","zygekdy.l.w+g@snh.owpyu.com","r+evgvxmksf@wcjaki.n.com","hfmeqzk.isx+h@fiidmdrsu.com","bizdm+lov+cy@il.cjjlp.com","hfmeqzk.isx+o@fiidmdrsu.com","bizdm+hs+qao@il.cjjlp.com","r+v+z+rcuznrj@wcjaki.n.com","j+r.kn+h.w.a.h+bh@rfpycgjuf.com","hfmeqzk.isx+t@fiidmdrsu.com","hfmeqzk.isx+a@fiidmdrsu.com","zygekdy.l.w+o@snh.owpyu.com","zygekdy.l.w+i@snh.owpyu.com","r+vy.u.y+f.er+aw@wcjaki.n.com","zygekdy.l.w+c@snh.owpyu.com","bizdm+wztzg@il.cjjlp.com","j+h.fwbsr+chp@rfpycgjuf.com","zygekdy.l.w+s@snh.owpyu.com","zygekdy.l.w+d@snh.owpyu.com","bizdm+qq.o.q+p@il.cjjlp.com","zygekdy.l.w+o@snh.owpyu.com","j+c+zqbq+h.dyt@rfpycgjuf.com","r+hl.b.i+fz.hz.t@wcjaki.n.com","r+cbabpf.k+w+e@wcjaki.n.com"]
    # emails = ["test.emailalex@leetcode.com","test.e.mailbob.cathy@leetcode.com","testemail+david@lee.tcode.com"]

    solution = Solution()
    output = solution.numUniqueEmails(emails)
    print ("Num of Unique Email Address: ", output)

if __name__ == '__main__':
    main()



'''
Notes
- Not that difficult

Solution
1. Create a set to store all unique emails
2. Traverse through email Array:
- Split email from the @ into localName and DomainName
- Filter out localName
- Combine localName + @ + domainName and place to Set
3. Return Size of the set

'''