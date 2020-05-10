# android 使用mediaplayer播放网络音乐

封装一个管理类，用于播放在线的音乐
由于播放在线音乐时可能会因为网络的原因，导致耗时比较大，这里使用了AndroidVideoCache这个库，来实现音频的缓存，下次再播放的时候就可以避免再次从网络获取。
AndroidVideoCache地址：https://github.com/danikula/AndroidVideoCache
