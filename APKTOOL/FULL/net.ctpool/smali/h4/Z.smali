.class public final synthetic Lh4/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Lh4/c0;


# direct methods
.method public synthetic constructor <init>(Lh4/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/Z;->a:Lh4/c0;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/Z;->a:Lh4/c0;

    invoke-static {v0, p1}, Lh4/c0;->b(Lh4/c0;Lz3/l;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
