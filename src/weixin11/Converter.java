package weixin11;
//@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
