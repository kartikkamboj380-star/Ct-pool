.class public final synthetic LE4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/b;


# instance fields
.field public final synthetic a:LY3/f;


# direct methods
.method public synthetic constructor <init>(LY3/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE4/a;->a:LY3/f;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE4/a;->a:LY3/f;

    invoke-static {v0}, Lcom/google/firebase/installations/c;->e(LY3/f;)LF4/b;

    move-result-object v0

    return-object v0
.end method
