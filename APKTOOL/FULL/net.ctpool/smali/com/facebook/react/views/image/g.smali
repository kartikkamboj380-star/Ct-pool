.class public abstract Lcom/facebook/react/views/image/g;
.super Lj1/g;
.source "SourceFile"

# interfaces
.implements Lg1/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/image/g$a;,
        Lcom/facebook/react/views/image/g$b;
    }
.end annotation


# static fields
.field public static final q:Lcom/facebook/react/views/image/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/image/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/image/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/image/g;->q:Lcom/facebook/react/views/image/g$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/views/image/g$b;

    invoke-direct {v0}, Lcom/facebook/react/views/image/g$b;-><init>()V

    invoke-direct {p0, v0}, Lj1/g;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    const-string p2, "id"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "id"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected onLevelChange(I)Z
    .locals 1

    const/16 v0, 0x2710

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/views/image/g;->x(II)V

    invoke-super {p0, p1}, Lj1/g;->onLevelChange(I)Z

    move-result p1

    return p1
.end method

.method public q(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "id"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "throwable"

    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract x(II)V
.end method
