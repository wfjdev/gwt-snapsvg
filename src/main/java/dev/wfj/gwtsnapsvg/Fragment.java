package dev.wfj.gwtsnapsvg;

import jsinterop.annotations.JsType;

@JsType(name = "Object", isNative = true)
public interface Fragment {
    Fragment fragment(Object... elementsOrString);
}
