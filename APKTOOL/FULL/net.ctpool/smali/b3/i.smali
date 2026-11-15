.class public final synthetic Lb3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/b$a;


# instance fields
.field public final synthetic a:Lc3/d;


# direct methods
.method public synthetic constructor <init>(Lc3/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/i;->a:Lc3/d;

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb3/i;->a:Lc3/d;

    invoke-interface {v0}, Lc3/d;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
