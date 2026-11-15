.class public final synthetic LN4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS2/h;


# instance fields
.field public final synthetic a:LN4/g;


# direct methods
.method public synthetic constructor <init>(LN4/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN4/f;->a:LN4/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LN4/f;->a:LN4/g;

    check-cast p1, LN4/z;

    invoke-static {v0, p1}, LN4/g;->b(LN4/g;LN4/z;)[B

    move-result-object p1

    return-object p1
.end method
