package com.atguigu.adapter.interfaceAdapter;

///定义一个Adapter接口 
public interface HandlerAdapter {
	boolean supports(Object handler);
	void handle(Object handler);
}

// 多种适配器类
class SimpleHandlerAdapter implements HandlerAdapter {

	@Override
	public void handle(Object handler) {
		((SimpleController) handler).doSimplerHandler();
	}

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof SimpleController);
	}
}

class HttpHandlerAdapter implements HandlerAdapter {

	@Override
	public void handle(Object handler) {
		((HttpController) handler).doHttpHandler();
	}

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof HttpController);
	}

}

class AnnotationHandlerAdapter implements HandlerAdapter {

	@Override
	public void handle(Object handler) {
		((AnnotationController) handler).AnnotationHandler();
	}

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof AnnotationController);
	}

}