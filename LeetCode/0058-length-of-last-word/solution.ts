function lengthOfLastWord(s: string): number {
    const str :String[] = s.trim().split(' ');
    return str[str.length-1].length;
};
