.class public final Lcom/facebook/react/bridge/SoftAssertions;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/facebook/react/bridge/SoftAssertions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/bridge/SoftAssertions;

    invoke-direct {v0}, Lcom/facebook/react/bridge/SoftAssertions;-><init>()V

    sput-object v0, Lcom/facebook/react/bridge/SoftAssertions;->INSTANCE:Lcom/facebook/react/bridge/SoftAssertions;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final assertCondition(ZLjava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    new-instance p0, Lcom/facebook/react/bridge/AssertionException;

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/AssertionException;-><init>(Ljava/lang/String;)V

    const-string p1, "SoftAssertions"

    invoke-static {p1, p0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static final assertNotNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    new-instance v0, Lcom/facebook/react/bridge/AssertionException;

    const-string v1, "Expected object to not be null!"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/AssertionException;-><init>(Ljava/lang/String;)V

    const-string v1, "SoftAssertions"

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object p0
.end method

.method public static final assertUnreachable(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/bridge/AssertionException;

    invoke-direct {v0, p0}, Lcom/facebook/react/bridge/AssertionException;-><init>(Ljava/lang/String;)V

    const-string p0, "SoftAssertions"

    invoke-static {p0, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
