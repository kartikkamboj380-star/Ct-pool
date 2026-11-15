.class LU4/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR4/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU4/h;->f(LR4/p;)LR4/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:LU4/h;


# direct methods
.method constructor <init>(LU4/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/h$a;->m:LU4/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LR4/d;Lcom/google/gson/reflect/TypeToken;)LR4/q;
    .locals 0

    .line 1
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class p2, Ljava/lang/Number;

    .line 6
    .line 7
    if-ne p1, p2, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LU4/h$a;->m:LU4/h;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    return-object p1
.end method
