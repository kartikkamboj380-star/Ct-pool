.class public Lcom/facebook/react/views/textinput/ReactTextInputManager;
.super Lcom/facebook/react/uimanager/BaseViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/textinput/ReactTextInputManager$d;,
        Lcom/facebook/react/views/textinput/ReactTextInputManager$b;,
        Lcom/facebook/react/views/textinput/ReactTextInputManager$c;,
        Lcom/facebook/react/views/textinput/ReactTextInputManager$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "Lcom/facebook/react/views/textinput/j;",
        "Lcom/facebook/react/uimanager/v;",
        ">;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "AndroidTextInput"
.end annotation


# static fields
.field private static final AUTOCAPITALIZE_FLAGS:I = 0x7000

.field private static final BLUR_TEXT_INPUT:I = 0x2

.field private static final DRAWABLE_HANDLE_FIELDS:[Ljava/lang/String;

.field private static final DRAWABLE_HANDLE_RESOURCES:[Ljava/lang/String;

.field private static final EMPTY_FILTERS:[Landroid/text/InputFilter;

.field private static final FOCUS_TEXT_INPUT:I = 0x1

.field private static final IME_ACTION_ID:I = 0x670

.field private static final INPUT_TYPE_KEYBOARD_DECIMAL_PAD:I = 0x2002

.field private static final INPUT_TYPE_KEYBOARD_NUMBERED:I = 0x3002

.field private static final INPUT_TYPE_KEYBOARD_NUMBER_PAD:I = 0x2

.field private static final KEYBOARD_TYPE_DECIMAL_PAD:Ljava/lang/String; = "decimal-pad"

.field private static final KEYBOARD_TYPE_EMAIL_ADDRESS:Ljava/lang/String; = "email-address"

.field private static final KEYBOARD_TYPE_NUMBER_PAD:Ljava/lang/String; = "number-pad"

.field private static final KEYBOARD_TYPE_NUMERIC:Ljava/lang/String; = "numeric"

.field private static final KEYBOARD_TYPE_PHONE_PAD:Ljava/lang/String; = "phone-pad"

.field private static final KEYBOARD_TYPE_URI:Ljava/lang/String; = "url"

.field private static final KEYBOARD_TYPE_VISIBLE_PASSWORD:Ljava/lang/String; = "visible-password"

.field private static final PASSWORD_VISIBILITY_FLAG:I = 0x10

.field public static final REACT_CLASS:Ljava/lang/String; = "AndroidTextInput"

.field private static final REACT_PROPS_AUTOFILL_HINTS_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final SET_MOST_RECENT_EVENT_COUNT:I = 0x3

.field private static final SET_TEXT_AND_SELECTION:I = 0x4

.field private static final SPACING_TYPES:[I

.field public static final TAG:Ljava/lang/String; = "ReactTextInputManager"

.field private static final TX_STATE_KEY_ATTRIBUTED_STRING:S = 0x0s

.field private static final TX_STATE_KEY_HASH:S = 0x2s

.field private static final TX_STATE_KEY_MOST_RECENT_EVENT_COUNT:S = 0x3s

.field private static final TX_STATE_KEY_PARAGRAPH_ATTRIBUTES:S = 0x1s

.field private static final UNSET:I = -0x1


# instance fields
.field protected mReactTextViewManagerCallback:Lcom/facebook/react/views/text/n;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x3

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x2

    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;->SPACING_TYPES:[I

    new-instance v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$a;

    invoke-direct {v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager$a;-><init>()V

    sput-object v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;->REACT_PROPS_AUTOFILL_HINTS_MAP:Ljava/util/Map;

    new-array v0, v3, [Landroid/text/InputFilter;

    sput-object v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;->EMPTY_FILTERS:[Landroid/text/InputFilter;

    const-string v0, "mTextSelectHandleRightRes"

    const-string v1, "mTextSelectHandleRes"

    const-string v2, "mTextSelectHandleLeftRes"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;->DRAWABLE_HANDLE_RESOURCES:[Ljava/lang/String;

    const-string v0, "mSelectHandleRight"

    const-string v1, "mSelectHandleCenter"

    const-string v2, "mSelectHandleLeft"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;->DRAWABLE_HANDLE_FIELDS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/BaseViewManager;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/e0;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->lambda$addEventEmitters$1(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/e0;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/textinput/j;Landroid/view/View;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->lambda$addEventEmitters$0(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/textinput/j;Landroid/view/View;Z)V

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->getEventDispatcher(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;

    move-result-object p0

    return-object p0
.end method

.method private static checkPasswordType(Lcom/facebook/react/views/textinput/j;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->getStagedInputType()I

    move-result v0

    and-int/lit16 v0, v0, 0x3002

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->getStagedInputType()I

    move-result v0

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/16 v0, 0x10

    invoke-static {p0, v1, v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->updateStagedInputTypeFlag(Lcom/facebook/react/views/textinput/j;II)V

    :cond_0
    return-void
.end method

.method private static getEventDispatcher(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object p0

    return-object p0
.end method

.method private getReactTextUpdate(Ljava/lang/String;I)Lcom/facebook/react/views/text/i;
    .locals 11

    .line 1
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    sget-object v0, Lcom/facebook/react/views/text/t;->q:Lcom/facebook/react/views/text/t;

    invoke-static {p1, v0}, Lcom/facebook/react/views/text/t;->h(Ljava/lang/String;Lcom/facebook/react/views/text/t;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    new-instance p1, Lcom/facebook/react/views/text/i;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p1

    move v2, p2

    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/text/i;-><init>(Landroid/text/Spannable;IZFFFFIII)V

    return-object p1
.end method

.method private static synthetic lambda$addEventEmitters$0(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/textinput/j;Landroid/view/View;Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/e0;->c()I

    move-result p2

    invoke-static {p0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->getEventDispatcher(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;

    move-result-object p0

    if-eqz p3, :cond_0

    new-instance p3, Lcom/facebook/react/views/textinput/p;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-direct {p3, p2, p1}, Lcom/facebook/react/views/textinput/p;-><init>(II)V

    :goto_0
    invoke-interface {p0, p3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    goto :goto_1

    :cond_0
    new-instance p3, Lcom/facebook/react/views/textinput/n;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {p3, p2, v0}, Lcom/facebook/react/views/textinput/n;-><init>(II)V

    invoke-interface {p0, p3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    new-instance p3, Lcom/facebook/react/views/textinput/o;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p2, v0, p1}, Lcom/facebook/react/views/textinput/o;-><init>(IILjava/lang/String;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method private static synthetic lambda$addEventEmitters$1(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/e0;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 6

    and-int/lit16 p2, p3, 0xff

    const/4 p4, 0x1

    if-nez p2, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    return p4

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->z()Z

    move-result p2

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->X()Z

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->W()Z

    move-result v1

    if-eqz v0, :cond_2

    invoke-static {p1, p0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->getEventDispatcher(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;

    move-result-object v2

    new-instance v3, Lcom/facebook/react/views/textinput/L;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/e0;->c()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {p0}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, p1, v4, v5}, Lcom/facebook/react/views/textinput/L;-><init>(IILjava/lang/String;)V

    invoke-interface {v2, v3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->clearFocus()V

    :cond_3
    if-nez v1, :cond_6

    if-nez v0, :cond_6

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    const/4 p0, 0x5

    if-eq p3, p0, :cond_6

    const/4 p0, 0x7

    if-ne p3, p0, :cond_5

    goto :goto_1

    :cond_5
    const/4 p4, 0x0

    :cond_6
    :goto_1
    return p4
.end method

.method private varargs setAutofillHints(Lcom/facebook/react/views/textinput/j;[Ljava/lang/String;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Lcom/facebook/react/views/textinput/G;->a(Lcom/facebook/react/views/textinput/j;[Ljava/lang/String;)V

    return-void
.end method

.method private setImportantForAutofill(Lcom/facebook/react/views/textinput/j;I)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2}, Lcom/facebook/react/views/textinput/v;->a(Lcom/facebook/react/views/textinput/j;I)V

    return-void
.end method

.method private static shouldHideCursorForEmailTextInput()Z
    .locals 3

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ne v1, v2, :cond_0

    const-string v1, "xiaomi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static updateStagedInputTypeFlag(Lcom/facebook/react/views/textinput/j;II)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/j;->getStagedInputType()I

    move-result v0

    not-int p1, p1

    and-int/2addr p1, v0

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/j;->setStagedInputType(I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/textinput/j;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/textinput/j;)V
    .locals 1

    .line 2
    invoke-static {p1, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->getEventDispatcher(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/react/views/textinput/j;->setEventDispatcher(Lcom/facebook/react/uimanager/events/e;)V

    new-instance v0, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager$e;-><init>(Lcom/facebook/react/views/textinput/ReactTextInputManager;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/textinput/j;)V

    invoke-virtual {p2, v0}, Lcom/facebook/react/views/textinput/j;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance v0, Lcom/facebook/react/views/textinput/H;

    invoke-direct {v0, p1, p2}, Lcom/facebook/react/views/textinput/H;-><init>(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/textinput/j;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    new-instance v0, Lcom/facebook/react/views/textinput/I;

    invoke-direct {v0, p2, p1}, Lcom/facebook/react/views/textinput/I;-><init>(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/e0;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/U;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->createShadowNodeInstance()Lcom/facebook/react/views/text/c;

    move-result-object v0

    return-object v0
.end method

.method public createShadowNodeInstance()Lcom/facebook/react/views/text/c;
    .locals 1

    .line 2
    new-instance v0, Lcom/facebook/react/views/textinput/K;

    invoke-direct {v0}, Lcom/facebook/react/views/textinput/K;-><init>()V

    return-object v0
.end method

.method public createShadowNodeInstance(Lcom/facebook/react/views/text/n;)Lcom/facebook/react/views/text/c;
    .locals 1

    .line 3
    new-instance v0, Lcom/facebook/react/views/textinput/K;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/textinput/K;-><init>(Lcom/facebook/react/views/text/n;)V

    return-object v0
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/textinput/j;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/textinput/j;
    .locals 2

    .line 2
    new-instance v0, Lcom/facebook/react/views/textinput/j;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/textinput/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    move-result p1

    const v1, -0x20001

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/textinput/j;->setInputType(I)V

    const-string p1, "done"

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/textinput/j;->setReturnKeyType(Ljava/lang/String;)V

    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getCommandsMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "focusTextInput"

    const-string v3, "blurTextInput"

    invoke-static {v2, v0, v3, v1}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getExportedCustomBubblingEventTypeConstants()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomBubblingEventTypeConstants()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-static {}, LS1/f;->a()LS1/f$a;

    move-result-object v1

    const-string v2, "onSubmitEditing"

    const-string v3, "onSubmitEditingCapture"

    const-string v4, "bubbled"

    const-string v5, "captured"

    invoke-static {v4, v2, v5, v3}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "phasedRegistrationNames"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v6, "topSubmitEditing"

    invoke-virtual {v1, v6, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    const-string v2, "onEndEditing"

    const-string v6, "onEndEditingCapture"

    invoke-static {v4, v2, v5, v6}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v6, "topEndEditing"

    invoke-virtual {v1, v6, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    const-string v2, "onFocus"

    const-string v6, "onFocusCapture"

    invoke-static {v4, v2, v5, v6}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v6, "topFocus"

    invoke-virtual {v1, v6, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    const-string v2, "onBlur"

    const-string v6, "onBlurCapture"

    invoke-static {v4, v2, v5, v6}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v6, "topBlur"

    invoke-virtual {v1, v6, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    const-string v2, "onKeyPress"

    const-string v6, "onKeyPressCapture"

    invoke-static {v4, v2, v5, v6}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "topKeyPress"

    invoke-virtual {v1, v3, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    invoke-virtual {v1}, LS1/f$a;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-static {}, LS1/f;->a()LS1/f$a;

    move-result-object v1

    sget-object v2, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    invoke-static {v2}, Lcom/facebook/react/views/scroll/h;->h(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "registrationName"

    const-string v4, "onScroll"

    invoke-static {v3, v4}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    invoke-virtual {v1}, LS1/f$a;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getExportedViewConstants()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v0, 0x1000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v0, 0x2000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v0, 0x4000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v1, "none"

    const-string v3, "characters"

    const-string v5, "words"

    const-string v7, "sentences"

    invoke-static/range {v1 .. v8}, LS1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "AutoCapitalizationType"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "AndroidTextInput"

    return-object v0
.end method

.method public getReactTextUpdate(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;
    .locals 6

    .line 2
    invoke-interface {p3}, Lcom/facebook/react/common/mapbuffer/a;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {p3, v3}, Lcom/facebook/react/common/mapbuffer/a;->D0(I)Lcom/facebook/react/common/mapbuffer/a;

    move-result-object v3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2, v1}, Lcom/facebook/react/views/text/s;->f(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/a;Lcom/facebook/react/views/text/n;)Landroid/text/Spannable;

    move-result-object v1

    const/4 v4, 0x2

    invoke-interface {v3, v4}, Lcom/facebook/react/common/mapbuffer/a;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/react/views/text/q;->h(Ljava/lang/String;)I

    move-result v3

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1a

    if-ge v4, v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/facebook/react/views/textinput/F;->a(Lcom/facebook/react/views/textinput/j;)I

    move-result v0

    :goto_0
    const/4 v4, 0x3

    invoke-interface {p3, v4}, Lcom/facebook/react/common/mapbuffer/a;->getInt(I)I

    move-result p3

    invoke-static {v2}, Lcom/facebook/react/views/text/s;->i(Lcom/facebook/react/common/mapbuffer/a;)Z

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->getGravityHorizontal()I

    move-result p1

    invoke-static {p2, v2, p1}, Lcom/facebook/react/views/text/q;->g(Lcom/facebook/react/uimanager/W;ZI)I

    move-result p1

    invoke-static {p2, v0}, Lcom/facebook/react/views/text/q;->d(Lcom/facebook/react/uimanager/W;I)I

    move-result p2

    invoke-static {v1, p3, p1, v3, p2}, Lcom/facebook/react/views/text/i;->a(Landroid/text/Spannable;IIII)Lcom/facebook/react/views/text/i;

    move-result-object p1

    return-object p1
.end method

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/react/uimanager/v;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/facebook/react/views/textinput/K;

    return-object v0
.end method

.method protected bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->onAfterUpdateTransaction(Lcom/facebook/react/views/textinput/j;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/facebook/react/views/textinput/j;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->N()V

    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->w()V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->receiveCommand(Lcom/facebook/react/views/textinput/j;ILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->receiveCommand(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/facebook/react/views/textinput/j;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const-string p2, "setTextAndSelection"

    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->receiveCommand(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_1

    :cond_1
    const-string p2, "blur"

    goto :goto_0

    :cond_2
    const-string p2, "focus"

    goto :goto_0

    :goto_1
    return-void
.end method

.method public receiveCommand(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 6

    .line 4
    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/4 v4, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    :goto_0
    move p2, v4

    goto :goto_1

    :sswitch_0
    const-string v5, "focusTextInput"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x4

    goto :goto_1

    :sswitch_1
    const-string v5, "setTextAndSelection"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    move p2, v0

    goto :goto_1

    :sswitch_2
    const-string v5, "focus"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    move p2, v1

    goto :goto_1

    :sswitch_3
    const-string v5, "blur"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    move p2, v2

    goto :goto_1

    :sswitch_4
    const-string v5, "blurTextInput"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    move p2, v3

    :goto_1
    packed-switch p2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    invoke-interface {p3, v3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result p2

    if-ne p2, v4, :cond_5

    return-void

    :cond_5
    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v1

    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v0

    if-ne v0, v4, :cond_6

    move v0, v1

    :cond_6
    invoke-interface {p3, v2}, Lcom/facebook/react/bridge/ReadableArray;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {p3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->getReactTextUpdate(Ljava/lang/String;I)Lcom/facebook/react/views/text/i;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/facebook/react/views/textinput/j;->L(Lcom/facebook/react/views/text/i;)V

    :cond_7
    invoke-virtual {p1, p2, v1, v0}, Lcom/facebook/react/views/textinput/j;->J(III)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->P()V

    goto :goto_2

    :pswitch_2
    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->v()V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x654a360a -> :sswitch_4
        0x2e3067 -> :sswitch_3
        0x5d154d8 -> :sswitch_2
        0x550e73c4 -> :sswitch_1
        0x64c614a5 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public setAllowFontScaling(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "allowFontScaling"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setAllowFontScaling(Z)V

    return-void
.end method

.method public setAutoCapitalize(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 4
    .annotation runtime Lx2/a;
        name = "autoCapitalize"
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v1

    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v1, v2, :cond_0

    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    move-result v0

    goto :goto_2

    :cond_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v1

    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    const/16 v3, 0x4000

    if-ne v1, v2, :cond_5

    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/4 v1, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "characters"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v2, "sentences"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v2, "words"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v2, "none"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    move v1, v0

    :goto_0
    packed-switch v1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/16 v0, 0x1000

    goto :goto_2

    :cond_5
    :goto_1
    :pswitch_1
    move v0, v3

    goto :goto_2

    :pswitch_2
    const/16 v0, 0x2000

    :goto_2
    :pswitch_3
    const/16 p2, 0x7000

    invoke-static {p1, p2, v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->updateStagedInputTypeFlag(Lcom/facebook/react/views/textinput/j;II)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x33af38 -> :sswitch_3
        0x6c11aa9 -> :sswitch_2
        0x1d36f670 -> :sswitch_1
        0x4a3baa6a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setAutoCorrect(Lcom/facebook/react/views/textinput/j;Ljava/lang/Boolean;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "autoCorrect"
    .end annotation

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    const p2, 0x8000

    goto :goto_0

    :cond_0
    const/high16 p2, 0x80000

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    const v0, 0x88000

    invoke-static {p1, v0, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->updateStagedInputTypeFlag(Lcom/facebook/react/views/textinput/j;II)V

    return-void
.end method

.method public setAutoFocus(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "autoFocus"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setAutoFocus(Z)V

    return-void
.end method

.method public setBorderColor(Lcom/facebook/react/views/textinput/j;ILjava/lang/Integer;)V
    .locals 3
    .annotation runtime Lx2/b;
        customType = "Color"
        names = {
            "borderColor",
            "borderLeftColor",
            "borderRightColor",
            "borderTopColor",
            "borderBottomColor"
        }
    .end annotation

    const/high16 v0, 0x7fc00000    # Float.NaN

    if-nez p3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const v2, 0xffffff

    and-int/2addr v1, v2

    int-to-float v1, v1

    :goto_0
    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    ushr-int/lit8 p3, p3, 0x18

    int-to-float v0, p3

    :goto_1
    sget-object p3, Lcom/facebook/react/views/textinput/ReactTextInputManager;->SPACING_TYPES:[I

    aget p2, p3, p2

    invoke-virtual {p1, p2, v1, v0}, Lcom/facebook/react/views/textinput/j;->S(IFF)V

    return-void
.end method

.method public setBorderRadius(Lcom/facebook/react/views/textinput/j;IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderRadius",
            "borderTopLeftRadius",
            "borderTopRightRadius",
            "borderBottomRightRadius",
            "borderBottomLeftRadius"
        }
    .end annotation

    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1, p3}, Lcom/facebook/react/views/textinput/j;->setBorderRadius(F)V

    goto :goto_0

    :cond_1
    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p3, p2}, Lcom/facebook/react/views/textinput/j;->T(FI)V

    :goto_0
    return-void
.end method

.method public setBorderStyle(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "borderStyle"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setBorderStyle(Ljava/lang/String;)V

    return-void
.end method

.method public setBorderWidth(Lcom/facebook/react/views/textinput/j;IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderWidth",
            "borderLeftWidth",
            "borderRightWidth",
            "borderTopWidth",
            "borderBottomWidth"
        }
    .end annotation

    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    :cond_0
    sget-object v0, Lcom/facebook/react/views/textinput/ReactTextInputManager;->SPACING_TYPES:[I

    aget p2, v0, p2

    invoke-virtual {p1, p2, p3}, Lcom/facebook/react/views/textinput/j;->U(IF)V

    return-void
.end method

.method public setCaretHidden(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 2
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "caretHidden"
    .end annotation

    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->getStagedInputType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->shouldHideCursorForEmailTextInput()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setCursorVisible(Z)V

    return-void
.end method

.method public setColor(Lcom/facebook/react/views/textinput/j;Ljava/lang/Integer;)V
    .locals 3
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "color"
    .end annotation

    if-nez p2, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/facebook/react/views/text/a;->b(Landroid/content/Context;)Landroid/content/res/ColorStateList;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object p2, Lcom/facebook/react/views/textinput/ReactTextInputManager;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not get default text color from View Context: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string p1, "null"

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_1
    return-void
.end method

.method public setContextMenuHidden(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "contextMenuHidden"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setContextMenuHidden(Z)V

    return-void
.end method

.method public setCursorColor(Lcom/facebook/react/views/textinput/j;Ljava/lang/Integer;)V
    .locals 3
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "cursorColor"
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_2

    invoke-static {p1}, Lcom/facebook/react/views/textinput/t;->a(Lcom/facebook/react/views/textinput/j;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/facebook/react/views/textinput/x;->a()V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {}, Lcom/facebook/react/views/textinput/A;->a()Landroid/graphics/BlendMode;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/facebook/react/views/textinput/w;->a(ILandroid/graphics/BlendMode;)Landroid/graphics/BlendModeColorFilter;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    :goto_0
    invoke-static {p1, v0}, Lcom/facebook/react/views/textinput/u;->a(Lcom/facebook/react/views/textinput/j;Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void

    :cond_2
    const/16 v1, 0x1c

    if-ne v0, v1, :cond_3

    return-void

    :cond_3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "mCursorDrawableRes"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_4

    return-void

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/core/content/b;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p2, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    :goto_1
    const-class p2, Landroid/widget/TextView;

    const-string v2, "mEditor"

    invoke-virtual {p2, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    const-string v2, "mCursorDrawable"

    invoke-virtual {p2, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v0, v0}, [Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public setDisableFullscreenUI(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "disableFullscreenUI"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setDisableFullscreenUI(Z)V

    return-void
.end method

.method public setEditable(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "editable"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public setFontFamily(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "fontFamily"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setFontFamily(Ljava/lang/String;)V

    return-void
.end method

.method public setFontSize(Lcom/facebook/react/views/textinput/j;F)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultFloat = 14.0f
        name = "fontSize"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setFontSize(F)V

    return-void
.end method

.method public setFontStyle(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "fontStyle"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setFontStyle(Ljava/lang/String;)V

    return-void
.end method

.method public setFontVariant(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "fontVariant"
    .end annotation

    invoke-static {p2}, Lcom/facebook/react/views/text/o;->c(Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setFontFeatureSettings(Ljava/lang/String;)V

    return-void
.end method

.method public setFontWeight(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "fontWeight"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setFontWeight(Ljava/lang/String;)V

    return-void
.end method

.method public setImportantForAutofill(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "importantForAutofill"
    .end annotation

    .line 2
    const-string v0, "no"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x2

    goto :goto_0

    :cond_0
    const-string v0, "noExcludeDescendants"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p2, 0x8

    goto :goto_0

    :cond_1
    const-string v0, "yes"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const-string v0, "yesExcludeDescendants"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x4

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->setImportantForAutofill(Lcom/facebook/react/views/textinput/j;I)V

    return-void
.end method

.method public setIncludeFontPadding(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "includeFontPadding"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    return-void
.end method

.method public setInlineImageLeft(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "inlineImageLeft"
    .end annotation

    invoke-static {}, LJ2/c;->d()LJ2/c;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, LJ2/c;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    return-void
.end method

.method public setInlineImagePadding(Lcom/facebook/react/views/textinput/j;I)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "inlineImagePadding"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    return-void
.end method

.method public setKeyboardType(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "keyboardType"
    .end annotation

    const-string v0, "numeric"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p2, 0x3002

    goto :goto_0

    :cond_0
    const-string v0, "number-pad"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p2, 0x2

    goto :goto_0

    :cond_1
    const-string v0, "decimal-pad"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p2, 0x2002

    goto :goto_0

    :cond_2
    const-string v0, "email-address"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->shouldHideCursorForEmailTextInput()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setCursorVisible(Z)V

    :cond_3
    const/16 p2, 0x21

    goto :goto_0

    :cond_4
    const-string v0, "phone-pad"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p2, 0x3

    goto :goto_0

    :cond_5
    const-string v0, "visible-password"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 p2, 0x90

    goto :goto_0

    :cond_6
    const-string v0, "url"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    const/16 p2, 0x10

    goto :goto_0

    :cond_7
    const/4 p2, 0x1

    :goto_0
    const/16 v0, 0xf

    invoke-static {p1, v0, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->updateStagedInputTypeFlag(Lcom/facebook/react/views/textinput/j;II)V

    invoke-static {p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->checkPasswordType(Lcom/facebook/react/views/textinput/j;)V

    return-void
.end method

.method public setLetterSpacing(Lcom/facebook/react/views/textinput/j;F)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultFloat = 0.0f
        name = "letterSpacing"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setLetterSpacingPt(F)V

    return-void
.end method

.method public setLineHeight(Lcom/facebook/react/views/textinput/j;I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultFloat = 0.0f
        name = "lineHeight"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setLineHeight(I)V

    return-void
.end method

.method public setMaxFontSizeMultiplier(Lcom/facebook/react/views/textinput/j;F)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultFloat = NaNf
        name = "maxFontSizeMultiplier"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setMaxFontSizeMultiplier(F)V

    return-void
.end method

.method public setMaxLength(Lcom/facebook/react/views/textinput/j;Ljava/lang/Integer;)V
    .locals 6
    .annotation runtime Lx2/a;
        name = "maxLength"
    .end annotation

    invoke-virtual {p1}, Landroid/widget/TextView;->getFilters()[Landroid/text/InputFilter;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/views/textinput/ReactTextInputManager;->EMPTY_FILTERS:[Landroid/text/InputFilter;

    const/4 v2, 0x0

    if-nez p2, :cond_2

    array-length p2, v0

    if-lez p2, :cond_7

    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    instance-of v5, v4, Landroid/text/InputFilter$LengthFilter;

    if-nez v5, :cond_0

    invoke-virtual {p2, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p2}, Ljava/util/LinkedList;->size()I

    move-result v0

    new-array v0, v0, [Landroid/text/InputFilter;

    invoke-virtual {p2, v0}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, [Landroid/text/InputFilter;

    goto :goto_2

    :cond_2
    array-length v1, v0

    const/4 v3, 0x1

    if-lez v1, :cond_6

    move v1, v2

    move v4, v1

    :goto_1
    array-length v5, v0

    if-ge v1, v5, :cond_4

    aget-object v5, v0, v1

    instance-of v5, v5, Landroid/text/InputFilter$LengthFilter;

    if-eqz v5, :cond_3

    new-instance v4, Landroid/text/InputFilter$LengthFilter;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-direct {v4, v5}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v4, v0, v1

    move v4, v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    if-nez v4, :cond_5

    array-length v1, v0

    add-int/2addr v1, v3

    new-array v1, v1, [Landroid/text/InputFilter;

    array-length v3, v0

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v2, v0

    new-instance v3, Landroid/text/InputFilter$LengthFilter;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v3, p2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v3, v0, v2

    move-object v0, v1

    :cond_5
    move-object v1, v0

    goto :goto_2

    :cond_6
    new-array v1, v3, [Landroid/text/InputFilter;

    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v0, v1, v2

    :cond_7
    :goto_2
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setMultiline(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 3
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "multiline"
    .end annotation

    const/high16 v0, 0x20000

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-static {p1, v2, v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->updateStagedInputTypeFlag(Lcom/facebook/react/views/textinput/j;II)V

    return-void
.end method

.method public setNumLines(Lcom/facebook/react/views/textinput/j;I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultInt = 0x1
        name = "numberOfLines"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setLines(I)V

    return-void
.end method

.method public setOnContentSizeChange(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "onContentSizeChange"
    .end annotation

    if-eqz p2, :cond_0

    new-instance p2, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;

    invoke-direct {p2, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager$b;-><init>(Lcom/facebook/react/views/textinput/j;)V

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setContentSizeWatcher(Lcom/facebook/react/views/textinput/a;)V

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setOnKeyPress(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "onKeyPress"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setOnKeyPress(Z)V

    return-void
.end method

.method public setOnScroll(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "onScroll"
    .end annotation

    if-eqz p2, :cond_0

    new-instance p2, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;

    invoke-direct {p2, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager$c;-><init>(Lcom/facebook/react/views/textinput/j;)V

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setScrollWatcher(Lcom/facebook/react/views/textinput/M;)V

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setOnSelectionChange(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "onSelectionChange"
    .end annotation

    if-eqz p2, :cond_0

    new-instance p2, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;

    invoke-direct {p2, p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager$d;-><init>(Lcom/facebook/react/views/textinput/j;)V

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setSelectionWatcher(Lcom/facebook/react/views/textinput/N;)V

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setOverflow(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "overflow"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setOverflow(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPadding(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/textinput/j;

    invoke-virtual/range {p0 .. p5}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->setPadding(Lcom/facebook/react/views/textinput/j;IIII)V

    return-void
.end method

.method public setPadding(Lcom/facebook/react/views/textinput/j;IIII)V
    .locals 0

    .line 2
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public setPlaceholder(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "placeholder"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setPlaceholder(Ljava/lang/String;)V

    return-void
.end method

.method public setPlaceholderTextColor(Lcom/facebook/react/views/textinput/j;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "placeholderTextColor"
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/facebook/react/views/text/a;->d(Landroid/content/Context;)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setHintTextColor(I)V

    :goto_0
    return-void
.end method

.method public setReturnKeyLabel(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "returnKeyLabel"
    .end annotation

    const/16 v0, 0x670

    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setImeActionLabel(Ljava/lang/CharSequence;I)V

    return-void
.end method

.method public setReturnKeyType(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "returnKeyType"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setReturnKeyType(Ljava/lang/String;)V

    return-void
.end method

.method public setSecureTextEntry(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "secureTextEntry"
    .end annotation

    if-eqz p2, :cond_0

    const/16 p2, 0x80

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/16 v0, 0x90

    invoke-static {p1, v0, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->updateStagedInputTypeFlag(Lcom/facebook/react/views/textinput/j;II)V

    invoke-static {p1}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->checkPasswordType(Lcom/facebook/react/views/textinput/j;)V

    return-void
.end method

.method public setSelectTextOnFocus(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "selectTextOnFocus"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    return-void
.end method

.method public setSelectionColor(Lcom/facebook/react/views/textinput/j;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "selectionColor"
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/facebook/react/views/text/a;->c(Landroid/content/Context;)I

    move-result p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setHighlightColor(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setSelectionHandleColor(Lcom/facebook/react/views/textinput/j;Ljava/lang/Integer;)V
    .locals 6
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "selectionHandleColor"
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {p1}, Lcom/facebook/react/views/textinput/s;->a(Lcom/facebook/react/views/textinput/j;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/react/views/textinput/y;->a(Lcom/facebook/react/views/textinput/j;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/react/views/textinput/z;->a(Lcom/facebook/react/views/textinput/j;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/facebook/react/views/textinput/x;->a()V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {}, Lcom/facebook/react/views/textinput/A;->a()Landroid/graphics/BlendMode;

    move-result-object v3

    invoke-static {p2, v3}, Lcom/facebook/react/views/textinput/w;->a(ILandroid/graphics/BlendMode;)Landroid/graphics/BlendModeColorFilter;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-virtual {v1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-virtual {v2, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    :goto_0
    invoke-static {p1, v0}, Lcom/facebook/react/views/textinput/B;->a(Lcom/facebook/react/views/textinput/j;Landroid/graphics/drawable/Drawable;)V

    invoke-static {p1, v1}, Lcom/facebook/react/views/textinput/C;->a(Lcom/facebook/react/views/textinput/j;Landroid/graphics/drawable/Drawable;)V

    invoke-static {p1, v2}, Lcom/facebook/react/views/textinput/D;->a(Lcom/facebook/react/views/textinput/j;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_1
    const/16 v1, 0x1c

    if-ne v0, v1, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x0

    :goto_1
    sget-object v1, Lcom/facebook/react/views/textinput/ReactTextInputManager;->DRAWABLE_HANDLE_RESOURCES:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_5

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    aget-object v1, v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v1}, Landroidx/core/content/b;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    :goto_2
    const-class v3, Landroid/widget/TextView;

    const-string v4, "mEditor"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Lcom/facebook/react/views/textinput/ReactTextInputManager;->DRAWABLE_HANDLE_FIELDS:[Ljava/lang/String;

    aget-object v5, v5, v0

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4, v3, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method public setSubmitBehavior(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "submitBehavior"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setSubmitBehavior(Ljava/lang/String;)V

    return-void
.end method

.method public setTextAlign(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 5
    .annotation runtime Lx2/a;
        name = "textAlign"
    .end annotation

    const-string v0, "justify"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/16 v3, 0x1a

    if-eqz v0, :cond_1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_0

    invoke-static {p1, v2}, Lcom/facebook/react/views/textinput/E;->a(Lcom/facebook/react/views/textinput/j;I)V

    :cond_0
    :goto_0
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/textinput/j;->setGravityHorizontal(I)V

    goto :goto_2

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v4, 0x0

    if-lt v0, v3, :cond_2

    invoke-static {p1, v4}, Lcom/facebook/react/views/textinput/E;->a(Lcom/facebook/react/views/textinput/j;I)V

    :cond_2
    if-eqz p2, :cond_7

    const-string v0, "auto"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "left"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "right"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setGravityHorizontal(I)V

    goto :goto_2

    :cond_5
    const-string v0, "center"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1, v2}, Lcom/facebook/react/views/textinput/j;->setGravityHorizontal(I)V

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid textAlign: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ReactNative"

    invoke-static {v0, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_1
    invoke-virtual {p1, v4}, Lcom/facebook/react/views/textinput/j;->setGravityHorizontal(I)V

    :goto_2
    return-void
.end method

.method public setTextAlignVertical(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Lx2/a;
        name = "textAlignVertical"
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    const-string v1, "auto"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "top"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p2, 0x30

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->setGravityVertical(I)V

    goto :goto_2

    :cond_1
    const-string v1, "bottom"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 p2, 0x50

    goto :goto_0

    :cond_2
    const-string v1, "center"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 p2, 0x10

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid textAlignVertical: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "ReactNative"

    invoke-static {v1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/textinput/j;->setGravityVertical(I)V

    :goto_2
    return-void
.end method

.method public setTextContentType(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Lx2/a;
        name = "autoComplete"
    .end annotation

    const/4 v0, 0x2

    if-nez p2, :cond_0

    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->setImportantForAutofill(Lcom/facebook/react/views/textinput/j;I)V

    goto :goto_1

    :cond_0
    const-string v1, "off"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/facebook/react/views/textinput/ReactTextInputManager;->REACT_PROPS_AUTOFILL_HINTS_MAP:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->setAutofillHints(Lcom/facebook/react/views/textinput/j;[Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid autoComplete: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "ReactNative"

    invoke-static {v1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setTextDecorationLine(Lcom/facebook/react/views/textinput/j;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Lx2/a;
        name = "textDecorationLine"
    .end annotation

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    and-int/lit8 v0, v0, -0x19

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p2, v1

    const-string v3, "underline"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v2

    or-int/lit8 v2, v2, 0x8

    :goto_1
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setPaintFlags(I)V

    goto :goto_2

    :cond_0
    const-string v3, "line-through"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v2

    or-int/lit8 v2, v2, 0x10

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public setUnderlineColor(Lcom/facebook/react/views/textinput/j;Ljava/lang/Integer;)V
    .locals 3
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "underlineColorAndroid"
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/facebook/react/views/textinput/ReactTextInputManager;->TAG:Ljava/lang/String;

    const-string v2, "NullPointerException when setting underlineColorAndroid for TextInput"

    invoke-static {v1, v2, v0}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_1
    return-void
.end method

.method public showKeyboardOnFocus(Lcom/facebook/react/views/textinput/j;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "showSoftInputOnFocus"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setShowSoftInputOnFocus(Z)V

    return-void
.end method

.method public bridge synthetic updateExtraData(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->updateExtraData(Lcom/facebook/react/views/textinput/j;Ljava/lang/Object;)V

    return-void
.end method

.method public updateExtraData(Lcom/facebook/react/views/textinput/j;Ljava/lang/Object;)V
    .locals 5

    .line 2
    instance-of v0, p2, Lcom/facebook/react/views/text/i;

    if-eqz v0, :cond_a

    check-cast p2, Lcom/facebook/react/views/text/i;

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->f()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->h()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->g()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->e()F

    move-result v3

    float-to-int v3, v3

    const/4 v4, -0x1

    if-ne v0, v4, :cond_0

    if-ne v1, v4, :cond_0

    if-ne v2, v4, :cond_0

    if-eq v3, v4, :cond_5

    :cond_0
    if-eq v0, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    :goto_0
    if-eq v1, v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    :goto_1
    if-eq v2, v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    :goto_2
    if-eq v3, v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    :goto_3
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    :cond_5
    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->i()Landroid/text/Spannable;

    move-result-object v0

    invoke-static {v0, p1}, LM2/n;->g(Landroid/text/Spannable;Landroid/widget/TextView;)V

    :cond_6
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_4

    :cond_7
    move v0, v2

    :goto_4
    if-eqz v0, :cond_9

    invoke-virtual {p1}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {p1}, Landroidx/appcompat/widget/l;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    :goto_5
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    move-result v0

    sub-int/2addr v2, v0

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->i()Landroid/text/Spannable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int v4, v0, v2

    :cond_9
    move v0, v4

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/textinput/j;->M(Lcom/facebook/react/views/text/i;)V

    invoke-virtual {p2}, Lcom/facebook/react/views/text/i;->c()I

    move-result p2

    invoke-virtual {p1, p2, v4, v0}, Lcom/facebook/react/views/textinput/j;->J(III)V

    :cond_a
    return-void
.end method

.method public bridge synthetic updateState(Landroid/view/View;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/textinput/j;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->updateState(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateState(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p1}, Lcom/facebook/react/views/textinput/j;->getStateWrapper()Lcom/facebook/react/uimanager/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    invoke-virtual {p1, p3}, Lcom/facebook/react/views/textinput/j;->setStateWrapper(Lcom/facebook/react/uimanager/d0;)V

    invoke-interface {p3}, Lcom/facebook/react/uimanager/d0;->c()Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/textinput/ReactTextInputManager;->getReactTextUpdate(Lcom/facebook/react/views/textinput/j;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
