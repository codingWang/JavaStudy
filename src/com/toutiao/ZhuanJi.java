package com.toutiao;

import java.util.Scanner;

public class ZhuanJi {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();//n首歌
            int s = in.nextInt();//每首歌s秒
            int l = in.nextInt();//每张CD长l秒
            //--------------------------------
            int count = (l+1)/(s+1);//歌曲要间隔1秒
            count = Math.min(n, count);
            if(count%13==0){//不能是13的倍数
                count--;
            }
            int sum = n/count;//n>count取整
            int yu = n%count;//取余
            if(yu!=0){
                sum++;
                if(yu%13==0&&(count-yu)==1){//查看最后最后一张专辑的情况
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
